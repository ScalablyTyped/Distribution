package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.shadesMod.Shade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ithemeslotruleMod {
  
  trait IThemeSlotRule extends StObject {
    
    /** If set, this slot is the specified shade of the slot it inherits from. */
    var asShade: js.UndefOr[Shade] = js.undefined
    
    /** The actual color this theme slot is if it is a color. */
    var color: js.UndefOr[IColor] = js.undefined
    
    /**
      * A collection of rules that inherit from this one. It is the responsibility of the inheriting rule to add
      * itself to its parent's dependentRules collection.
      */
    var dependentRules: js.Array[IThemeSlotRule]
    
    /** The theme slot this slot is based on. */
    var inherits: js.UndefOr[IThemeSlotRule] = js.undefined
    
    /**
      * Whether this slot is a background shade, which uses different logic for generating its inheriting-as-shade value.
      */
    var isBackgroundShade: js.UndefOr[Boolean] = js.undefined
    
    /** Whether this slot has been manually overridden (else, it was automatically generated based on inheritance). */
    var isCustomized: js.UndefOr[Boolean] = js.undefined
    
    /** The name of this theme slot. */
    var name: String
    
    /** The value of this slot if it is NOT a color. Must be falsey if not a color. */
    var value: js.UndefOr[String] = js.undefined
  }
  object IThemeSlotRule {
    
    inline def apply(dependentRules: js.Array[IThemeSlotRule], name: String): IThemeSlotRule = {
      val __obj = js.Dynamic.literal(dependentRules = dependentRules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemeSlotRule]
    }
    
    extension [Self <: IThemeSlotRule](x: Self) {
      
      inline def setAsShade(value: Shade): Self = StObject.set(x, "asShade", value.asInstanceOf[js.Any])
      
      inline def setAsShadeUndefined: Self = StObject.set(x, "asShade", js.undefined)
      
      inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDependentRules(value: js.Array[IThemeSlotRule]): Self = StObject.set(x, "dependentRules", value.asInstanceOf[js.Any])
      
      inline def setDependentRulesVarargs(value: IThemeSlotRule*): Self = StObject.set(x, "dependentRules", js.Array(value*))
      
      inline def setInherits(value: IThemeSlotRule): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      inline def setIsBackgroundShade(value: Boolean): Self = StObject.set(x, "isBackgroundShade", value.asInstanceOf[js.Any])
      
      inline def setIsBackgroundShadeUndefined: Self = StObject.set(x, "isBackgroundShade", js.undefined)
      
      inline def setIsCustomized(value: Boolean): Self = StObject.set(x, "isCustomized", value.asInstanceOf[js.Any])
      
      inline def setIsCustomizedUndefined: Self = StObject.set(x, "isCustomized", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
