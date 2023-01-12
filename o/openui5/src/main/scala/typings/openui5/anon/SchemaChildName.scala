package typings.openui5.anon

import typings.openui5.sapUiModelContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChildName extends StObject {
  
  /**
    * Whether a `Promise` may be returned if the needed metadata is not yet loaded (since 1.57.0)
    */
  @JSName("$$valueAsPromise")
  var DollarDollarvalueAsPromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Points to the given path, that is `oDetails.context.getProperty("") === sPath`
    */
  var context: default
  
  /**
    * The qualified name of the schema child where the computed annotation has been found, for example "name.space.EntityType"
    */
  var schemaChildName: String
}
object SchemaChildName {
  
  inline def apply(context: default, schemaChildName: String): SchemaChildName = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], schemaChildName = schemaChildName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChildName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaChildName] (val x: Self) extends AnyVal {
    
    inline def setContext(value: default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarvalueAsPromise(value: Boolean): Self = StObject.set(x, "$$valueAsPromise", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarvalueAsPromiseUndefined: Self = StObject.set(x, "$$valueAsPromise", js.undefined)
    
    inline def setSchemaChildName(value: String): Self = StObject.set(x, "schemaChildName", value.asInstanceOf[js.Any])
  }
}
