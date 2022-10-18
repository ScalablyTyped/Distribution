package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputSrcUseInputContentMod {
  
  @JSImport("@orbit-ui/react-components/dist/input/src/useInputContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInputButton(button: ReactElement, isActive: Boolean): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  inline def useInputButton(button: ReactElement, isActive: Boolean, props: Record[String, Any]): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def useInputIcon(icon: ReactNode): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def useInputIcon(icon: ReactNode, props: UseInputIconProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  /* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/icons.EmbeddedIconProps, 'className' | 'children'> */
  trait UseInputIconProps extends StObject {
    
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  }
  object UseInputIconProps {
    
    inline def apply(): UseInputIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputIconProps]
    }
    
    extension [Self <: UseInputIconProps](x: Self) {
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
