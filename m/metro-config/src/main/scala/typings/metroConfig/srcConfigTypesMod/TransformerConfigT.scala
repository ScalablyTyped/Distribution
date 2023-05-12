package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.PartialExtraTransformOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformerConfig * / any */ trait TransformerConfigT extends StObject {
  
  def getTransformOptions(
    entryPoints: js.Array[String],
    options: GetTransformOptionsOpts,
    getDependenciesOf: js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]
  ): js.Promise[PartialExtraTransformOpti]
  @JSName("getTransformOptions")
  var getTransformOptions_Original: GetTransformOptions
  
  var publicPath: String
  
  var workerPath: String
}
object TransformerConfigT {
  
  inline def apply(
    getTransformOptions: (/* entryPoints */ js.Array[String], /* options */ GetTransformOptionsOpts, /* getDependenciesOf */ js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]) => js.Promise[PartialExtraTransformOpti],
    publicPath: String,
    workerPath: String
  ): TransformerConfigT = {
    val __obj = js.Dynamic.literal(getTransformOptions = js.Any.fromFunction3(getTransformOptions), publicPath = publicPath.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformerConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformerConfigT] (val x: Self) extends AnyVal {
    
    inline def setGetTransformOptions(
      value: (/* entryPoints */ js.Array[String], /* options */ GetTransformOptionsOpts, /* getDependenciesOf */ js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]) => js.Promise[PartialExtraTransformOpti]
    ): Self = StObject.set(x, "getTransformOptions", js.Any.fromFunction3(value))
    
    inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
  }
}
