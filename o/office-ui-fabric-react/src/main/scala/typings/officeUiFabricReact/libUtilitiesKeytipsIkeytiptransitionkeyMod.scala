package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesKeytipsIkeytiptransitionkeyMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips/IKeytipTransitionKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionKeysAreEqual")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionKeysContain")(keys.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IKeytipTransitionKey extends StObject {
    
    var key: String
    
    var modifierKeys: js.UndefOr[js.Array[KeytipTransitionModifier]] = js.undefined
  }
  object IKeytipTransitionKey {
    
    inline def apply(key: String): IKeytipTransitionKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipTransitionKey]
    }
    
    extension [Self <: IKeytipTransitionKey](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setModifierKeys(value: js.Array[KeytipTransitionModifier]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      inline def setModifierKeysUndefined: Self = StObject.set(x, "modifierKeys", js.undefined)
      
      inline def setModifierKeysVarargs(value: KeytipTransitionModifier*): Self = StObject.set(x, "modifierKeys", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactInts.`16`
    - typings.officeUiFabricReact.officeUiFabricReactInts.`17`
    - typings.officeUiFabricReact.officeUiFabricReactInts.`18`
    - typings.officeUiFabricReact.officeUiFabricReactInts.`91`
  */
  trait KeytipTransitionModifier extends StObject
  object KeytipTransitionModifier {
    
    inline def `16`: typings.officeUiFabricReact.officeUiFabricReactInts.`16` = 16.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactInts.`16`]
    
    inline def `17`: typings.officeUiFabricReact.officeUiFabricReactInts.`17` = 17.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactInts.`17`]
    
    inline def `18`: typings.officeUiFabricReact.officeUiFabricReactInts.`18` = 18.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactInts.`18`]
    
    inline def `91`: typings.officeUiFabricReact.officeUiFabricReactInts.`91` = 91.asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactInts.`91`]
  }
}
