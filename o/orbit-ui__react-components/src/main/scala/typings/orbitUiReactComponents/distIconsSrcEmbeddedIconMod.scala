package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StringDictionary
import typings.orbitUiReactComponents.distSharedSrcSizeMod.Size
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIconsSrcEmbeddedIconMod {
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/EmbeddedIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object EmbeddedIcon {
    
    inline def apply(param0: EmbeddedIconProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@orbit-ui/react-components/dist/icons/src/EmbeddedIcon", "EmbeddedIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/icons/src/EmbeddedIcon", "EmbeddedIcon.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def embeddedIconSize(size: Size): `2xs` | xs | sm | md | lg | inherit = ^.asInstanceOf[js.Dynamic].applyDynamic("embeddedIconSize")(size.asInstanceOf[js.Any]).asInstanceOf[`2xs` | xs | sm | md | lg | inherit]
  
  trait EmbeddedIconProps
    extends StObject
       with /**
    * Allow any extra props
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * An icon can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  }
  object EmbeddedIconProps {
    
    inline def apply(): EmbeddedIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbeddedIconProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmbeddedIconProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
