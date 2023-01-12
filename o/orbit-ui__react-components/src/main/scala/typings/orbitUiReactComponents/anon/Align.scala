package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`10`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`11`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`12`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`13`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`4`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`5`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`6`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`7`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`8`
import typings.orbitUiReactComponents.orbitUiReactComponentsInts.`9`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.group
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.radiogroup
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[end | start] = js.undefined
  
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-invalid`: js.UndefOr[Boolean] = js.undefined
  
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var gap: js.UndefOr[
    typings.orbitUiReactComponents.orbitUiReactComponentsInts.`0` | typings.orbitUiReactComponents.orbitUiReactComponentsInts.`1` | typings.orbitUiReactComponents.orbitUiReactComponentsInts.`2` | typings.orbitUiReactComponents.orbitUiReactComponentsInts.`3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
  ] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var ref: js.UndefOr[typings.react.mod.Ref[Any]] = js.undefined
  
  var role: js.UndefOr[group | radiogroup] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object Align {
  
  inline def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: end | start): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-invalid`(value: Boolean): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    inline def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setGap(
      value: typings.orbitUiReactComponents.orbitUiReactComponentsInts.`0` | typings.orbitUiReactComponents.orbitUiReactComponentsInts.`1` | typings.orbitUiReactComponents.orbitUiReactComponentsInts.`2` | typings.orbitUiReactComponents.orbitUiReactComponentsInts.`3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
    ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRole(value: group | radiogroup): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
