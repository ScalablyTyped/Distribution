package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojcompositeMod.ViewModelContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var metadata: typings.oracleOraclejet.ojcompositeMod.Metadata
  
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, Any]
  ): Any
  
  var view: String
  
  def viewModel(param0: ViewModelContext): Unit | js.Object
}
object Metadata {
  
  inline def apply(
    metadata: typings.oracleOraclejet.ojcompositeMod.Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, Any]) => Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: typings.oracleOraclejet.ojcompositeMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setParseFunction(value: (String, String, js.Object, js.Function1[/* value */ String, Any]) => Any): Self = StObject.set(x, "parseFunction", js.Any.fromFunction4(value))
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: ViewModelContext => Unit | js.Object): Self = StObject.set(x, "viewModel", js.Any.fromFunction1(value))
  }
}
