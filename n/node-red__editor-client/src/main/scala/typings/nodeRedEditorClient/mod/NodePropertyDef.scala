package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.nodeRedEditorClientStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property definition
  * Read more: https://nodered.org/docs/creating-nodes/properties#property-definitions
  */
@js.native
trait NodePropertyDef[TVal, TInstProps /* <: NodeProperties */] extends StObject {
  
  /** Whether the property is required. If set to true, the property will be invalid if its value is null or an empty string. */
  var required: js.UndefOr[Boolean] = js.native
  
  /** If this property is a pointer to a configuration node, this identifies the type of the node. */
  var `type`: js.UndefOr[String] = js.native
  
  /** A function that can be used to validate the value of the property. */
  var validate: js.UndefOr[js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* val */ String, Boolean]] = js.native
  
  /** The default value the property takes */
  var value: TVal | _empty = js.native
}
object NodePropertyDef {
  
  @scala.inline
  def apply[TVal, TInstProps /* <: NodeProperties */](value: TVal | _empty): NodePropertyDef[TVal, TInstProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertyDef[TVal, TInstProps]]
  }
  
  @scala.inline
  implicit class NodePropertyDefMutableBuilder[Self <: NodePropertyDef[_, _], TVal, TInstProps /* <: NodeProperties */] (val x: Self with (NodePropertyDef[TVal, TInstProps])) extends AnyVal {
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidate(value: js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* val */ String, Boolean]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValue(value: TVal | _empty): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
