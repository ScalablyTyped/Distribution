package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.shadesMod.Shade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ithemeslotruleMod {
  
  @js.native
  trait IThemeSlotRule extends StObject {
    
    /** If set, this slot is the specified shade of the slot it inherits from. */
    var asShade: js.UndefOr[Shade] = js.native
    
    /** The actual color this theme slot is if it is a color. */
    var color: js.UndefOr[IColor] = js.native
    
    /**
      * A collection of rules that inherit from this one. It is the responsibility of the inheriting rule to add
      * itself to its parent's dependentRules collection.
      */
    var dependentRules: js.Array[IThemeSlotRule] = js.native
    
    /** The theme slot this slot is based on. */
    var inherits: js.UndefOr[IThemeSlotRule] = js.native
    
    /**
      * Whether this slot is a background shade, which uses different logic for generating its inheriting-as-shade value.
      */
    var isBackgroundShade: js.UndefOr[Boolean] = js.native
    
    /** Whether this slot has been manually overridden (else, it was automatically generated based on inheritance). */
    var isCustomized: js.UndefOr[Boolean] = js.native
    
    /** The name of this theme slot. */
    var name: String = js.native
    
    /** The value of this slot if it is NOT a color. Must be falsey if not a color. */
    var value: js.UndefOr[String] = js.native
  }
  object IThemeSlotRule {
    
    @scala.inline
    def apply(dependentRules: js.Array[IThemeSlotRule], name: String): IThemeSlotRule = {
      val __obj = js.Dynamic.literal(dependentRules = dependentRules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemeSlotRule]
    }
    
    @scala.inline
    implicit class IThemeSlotRuleMutableBuilder[Self <: IThemeSlotRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsShade(value: Shade): Self = StObject.set(x, "asShade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsShadeUndefined: Self = StObject.set(x, "asShade", js.undefined)
      
      @scala.inline
      def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDependentRules(value: js.Array[IThemeSlotRule]): Self = StObject.set(x, "dependentRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependentRulesVarargs(value: IThemeSlotRule*): Self = StObject.set(x, "dependentRules", js.Array(value :_*))
      
      @scala.inline
      def setInherits(value: IThemeSlotRule): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      @scala.inline
      def setIsBackgroundShade(value: Boolean): Self = StObject.set(x, "isBackgroundShade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBackgroundShadeUndefined: Self = StObject.set(x, "isBackgroundShade", js.undefined)
      
      @scala.inline
      def setIsCustomized(value: Boolean): Self = StObject.set(x, "isCustomized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCustomizedUndefined: Self = StObject.set(x, "isCustomized", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
