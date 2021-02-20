package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ikeytiptransitionkeyMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips/IKeytipTransitionKey", "transitionKeysAreEqual")
  @js.native
  def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips/IKeytipTransitionKey", "transitionKeysContain")
  @js.native
  def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = js.native
  
  @js.native
  trait IKeytipTransitionKey extends StObject {
    
    var key: String = js.native
    
    var modifierKeys: js.UndefOr[js.Array[KeytipTransitionModifier]] = js.native
  }
  object IKeytipTransitionKey {
    
    @scala.inline
    def apply(key: String): IKeytipTransitionKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipTransitionKey]
    }
    
    @scala.inline
    implicit class IKeytipTransitionKeyMutableBuilder[Self <: IKeytipTransitionKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierKeys(value: js.Array[KeytipTransitionModifier]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierKeysUndefined: Self = StObject.set(x, "modifierKeys", js.undefined)
      
      @scala.inline
      def setModifierKeysVarargs(value: KeytipTransitionModifier*): Self = StObject.set(x, "modifierKeys", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactNumbers.`16`
    - typings.officeUiFabricReact.officeUiFabricReactNumbers.`17`
    - typings.officeUiFabricReact.officeUiFabricReactNumbers.`18`
    - typings.officeUiFabricReact.officeUiFabricReactNumbers.`91`
  */
  trait KeytipTransitionModifier extends StObject
  object KeytipTransitionModifier {
    
    @scala.inline
    def `16`: typings.officeUiFabricReact.officeUiFabricReactNumbers.`16` = 16.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactNumbers.`16`]
    
    @scala.inline
    def `17`: typings.officeUiFabricReact.officeUiFabricReactNumbers.`17` = 17.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactNumbers.`17`]
    
    @scala.inline
    def `18`: typings.officeUiFabricReact.officeUiFabricReactNumbers.`18` = 18.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactNumbers.`18`]
    
    @scala.inline
    def `91`: typings.officeUiFabricReact.officeUiFabricReactNumbers.`91` = 91.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactNumbers.`91`]
  }
}
