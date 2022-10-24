package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Close
import typings.orbitUiReactComponents.distSelectSrcHiddenSelectMod.HiddenSelectProps
import typings.orbitUiReactComponents.distSelectSrcSelectMod.InnerSelectProps
import typings.orbitUiReactComponents.distSelectSrcUseSelectMod.UseSelectProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSelectSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/select/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object HiddenSelect {
    
    inline def apply(param0: HiddenSelectProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/select/src", "HiddenSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/select/src", "HiddenSelect.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def InnerSelect(props: InnerSelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSelect")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/select/src", "Select")
  @js.native
  val Select: OrbitComponent[HTMLElement, InnerSelectProps] = js.native
  
  inline def useSelect(children: ReactNode, param1: UseSelectProps): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(children.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Close]
}
