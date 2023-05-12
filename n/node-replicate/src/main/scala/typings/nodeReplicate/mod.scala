package typings.nodeReplicate

import org.scalablytyped.runtime.Shortcut
import typings.nodeReplicate.anon.Config
import typings.nodeReplicate.anon.OnUpdate
import typings.nodeReplicate.anon.PollingInterval
import typings.nodeReplicate.anon.Prompt
import typings.nodeReplicate.nodeReplicateStrings.canceled
import typings.nodeReplicate.nodeReplicateStrings.failed
import typings.nodeReplicate.nodeReplicateStrings.processing
import typings.nodeReplicate.nodeReplicateStrings.starting
import typings.nodeReplicate.nodeReplicateStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-replicate", JSImport.Default)
  @js.native
  val default: Replicate_ = js.native
  
  @JSImport("node-replicate", "replicate")
  @js.native
  val replicate: Replicate_ = js.native
  
  @js.native
  trait Model extends StObject {
    
    def createPrediction(inputs: PredictInput): js.Promise[Prediction] = js.native
    
    def predict(inputs: PredictInput): js.Promise[PredictionResponse] = js.native
    def predict(inputs: PredictInput, arg1: Unit, arg2: PollingInterval): js.Promise[PredictionResponse] = js.native
    def predict(inputs: PredictInput, arg1: OnUpdate): js.Promise[PredictionResponse] = js.native
    def predict(inputs: PredictInput, arg1: OnUpdate, arg2: PollingInterval): js.Promise[PredictionResponse] = js.native
  }
  
  trait PredictInput extends StObject {
    
    var prompt: String
  }
  object PredictInput {
    
    inline def apply(prompt: String): PredictInput = {
      val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PredictInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PredictInput] (val x: Self) extends AnyVal {
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prediction extends StObject {
    
    def hasTerminalStatus(): Boolean
    
    def load(): js.Promise[PredictionResponse]
  }
  object Prediction {
    
    inline def apply(hasTerminalStatus: () => Boolean, load: () => js.Promise[PredictionResponse]): Prediction = {
      val __obj = js.Dynamic.literal(hasTerminalStatus = js.Any.fromFunction0(hasTerminalStatus), load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[Prediction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prediction] (val x: Self) extends AnyVal {
      
      inline def setHasTerminalStatus(value: () => Boolean): Self = StObject.set(x, "hasTerminalStatus", js.Any.fromFunction0(value))
      
      inline def setLoad(value: () => js.Promise[PredictionResponse]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    }
  }
  
  trait PredictionResponse extends StObject {
    
    var complete_at: String | Null
    
    var created_at: String
    
    var error: String | Null
    
    var inputs: Prompt
    
    var output: js.Array[String] | Null
    
    var output_files: js.Array[String]
    
    var run_logs: String | Null
    
    var status: starting | processing | canceled | succeeded | failed
    
    var updated_at: String
    
    var user: String | Null
    
    var uuid: String
    
    var version: Config
    
    var version_id: String
  }
  object PredictionResponse {
    
    inline def apply(
      created_at: String,
      inputs: Prompt,
      output_files: js.Array[String],
      status: starting | processing | canceled | succeeded | failed,
      updated_at: String,
      uuid: String,
      version: Config,
      version_id: String
    ): PredictionResponse = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], output_files = output_files.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], version_id = version_id.asInstanceOf[js.Any], complete_at = null, error = null, output = null, run_logs = null, user = null)
      __obj.asInstanceOf[PredictionResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PredictionResponse] (val x: Self) extends AnyVal {
      
      inline def setComplete_at(value: String): Self = StObject.set(x, "complete_at", value.asInstanceOf[js.Any])
      
      inline def setComplete_atNull: Self = StObject.set(x, "complete_at", null)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setInputs(value: Prompt): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputNull: Self = StObject.set(x, "output", null)
      
      inline def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setOutput_files(value: js.Array[String]): Self = StObject.set(x, "output_files", value.asInstanceOf[js.Any])
      
      inline def setOutput_filesVarargs(value: String*): Self = StObject.set(x, "output_files", js.Array(value*))
      
      inline def setRun_logs(value: String): Self = StObject.set(x, "run_logs", value.asInstanceOf[js.Any])
      
      inline def setRun_logsNull: Self = StObject.set(x, "run_logs", null)
      
      inline def setStatus(value: starting | processing | canceled | succeeded | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Config): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersion_id(value: String): Self = StObject.set(x, "version_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Replicate_ extends StObject {
    
    def model(identifier: String): Model
  }
  object Replicate_ {
    
    inline def apply(model: String => Model): Replicate_ = {
      val __obj = js.Dynamic.literal(model = js.Any.fromFunction1(model))
      __obj.asInstanceOf[Replicate_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Replicate_] (val x: Self) extends AnyVal {
      
      inline def setModel(value: String => Model): Self = StObject.set(x, "model", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Replicate_
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Replicate_ = default
}
