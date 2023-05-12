package typings.metro

import org.scalablytyped.runtime.Shortcut
import typings.metro.srcDeltaBundlerTypesMod.TransformResult
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDeltaBundlerWorkerMod extends Shortcut {
  
  @JSImport("metro/src/DeltaBundler/Worker", JSImport.Default)
  @js.native
  val default: Worker = js.native
  
  trait Data extends StObject {
    
    val result: TransformResult[Unit]
    
    val sha1: String
    
    val transformFileEndLogEntry: LogEntry
    
    val transformFileStartLogEntry: LogEntry
  }
  object Data {
    
    inline def apply(
      result: TransformResult[Unit],
      sha1: String,
      transformFileEndLogEntry: LogEntry,
      transformFileStartLogEntry: LogEntry
    ): Data = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], transformFileEndLogEntry = transformFileEndLogEntry.asInstanceOf[js.Any], transformFileStartLogEntry = transformFileStartLogEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setResult(value: TransformResult[Unit]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      inline def setTransformFileEndLogEntry(value: LogEntry): Self = StObject.set(x, "transformFileEndLogEntry", value.asInstanceOf[js.Any])
      
      inline def setTransformFileStartLogEntry(value: LogEntry): Self = StObject.set(x, "transformFileStartLogEntry", value.asInstanceOf[js.Any])
    }
  }
  
  type LogEntry = Any
  
  type TransformOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformOptions */ Any
  
  trait TransformerConfig extends StObject {
    
    var transformerConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformerConfig */ Any
    
    var transformerPath: String
  }
  object TransformerConfig {
    
    inline def apply(
      transformerConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformerConfig */ Any,
      transformerPath: String
    ): TransformerConfig = {
      val __obj = js.Dynamic.literal(transformerConfig = transformerConfig.asInstanceOf[js.Any], transformerPath = transformerPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformerConfig] (val x: Self) extends AnyVal {
      
      inline def setTransformerConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformerConfig */ Any
      ): Self = StObject.set(x, "transformerConfig", value.asInstanceOf[js.Any])
      
      inline def setTransformerPath(value: String): Self = StObject.set(x, "transformerPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Worker extends StObject {
    
    def transform(
      filename: String,
      transformOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformOptions */ Any,
      projectRoot: String,
      transformerConfig: TransformerConfig
    ): js.Promise[Data] = js.native
    def transform(
      filename: String,
      transformOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformOptions */ Any,
      projectRoot: String,
      transformerConfig: TransformerConfig,
      fileBuffer: Buffer
    ): js.Promise[Data] = js.native
  }
  
  type _To = Worker
  
  /* This means you don't have to write `default`, but can instead just say `srcDeltaBundlerWorkerMod.foo` */
  override def _to: Worker = default
}
