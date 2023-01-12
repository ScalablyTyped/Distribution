package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcSizeMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptSize[T /* <: Size */](size: Size, adapter: SizeAdapter[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptSize")(size.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createSizeAdapter[T /* <: Size */](adapter: SizeAdapter[T]): js.Function1[/* size */ Size, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSizeAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ Size, T]]
  
  inline def normalizeSize[T /* <: Size */](): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")().asInstanceOf[md | T]
  inline def normalizeSize[T /* <: Size */](size: T): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")(size.asInstanceOf[js.Any]).asInstanceOf[md | T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl`
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl`
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl`
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
  */
  trait Size extends StObject
  object Size {
    
    inline def `2xl`: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl` = "2xl".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`]
    
    inline def `2xs`: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs` = "2xs".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`]
    
    inline def `3xl`: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl` = "3xl".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl`]
    
    inline def `4xl`: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl` = "4xl".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl`]
    
    inline def `5xl`: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl` = "5xl".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl`]
    
    inline def inherit: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit = "inherit".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit]
    
    inline def lg: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg = "lg".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg]
    
    inline def md: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md = "md".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md]
    
    inline def sm: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm = "sm".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm]
    
    inline def xl: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl = "xl".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl]
    
    inline def xs: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs = "xs".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs]
  }
  
  /* Inlined std.Partial<std.Record<@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/size.Size, T>> */
  trait SizeAdapter[T /* <: Size */] extends StObject {
    
    var `2xl`: js.UndefOr[T] = js.undefined
    
    var `2xs`: js.UndefOr[T] = js.undefined
    
    var `3xl`: js.UndefOr[T] = js.undefined
    
    var `4xl`: js.UndefOr[T] = js.undefined
    
    var `5xl`: js.UndefOr[T] = js.undefined
    
    var inherit: js.UndefOr[T] = js.undefined
    
    var lg: js.UndefOr[T] = js.undefined
    
    var md: js.UndefOr[T] = js.undefined
    
    var sm: js.UndefOr[T] = js.undefined
    
    var xl: js.UndefOr[T] = js.undefined
    
    var xs: js.UndefOr[T] = js.undefined
  }
  object SizeAdapter {
    
    inline def apply[T /* <: Size */](): SizeAdapter[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeAdapter[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeAdapter[?], T /* <: Size */] (val x: Self & SizeAdapter[T]) extends AnyVal {
      
      inline def set2xl(value: T): Self = StObject.set(x, "2xl", value.asInstanceOf[js.Any])
      
      inline def set2xlUndefined: Self = StObject.set(x, "2xl", js.undefined)
      
      inline def set2xs(value: T): Self = StObject.set(x, "2xs", value.asInstanceOf[js.Any])
      
      inline def set2xsUndefined: Self = StObject.set(x, "2xs", js.undefined)
      
      inline def set3xl(value: T): Self = StObject.set(x, "3xl", value.asInstanceOf[js.Any])
      
      inline def set3xlUndefined: Self = StObject.set(x, "3xl", js.undefined)
      
      inline def set4xl(value: T): Self = StObject.set(x, "4xl", value.asInstanceOf[js.Any])
      
      inline def set4xlUndefined: Self = StObject.set(x, "4xl", js.undefined)
      
      inline def set5xl(value: T): Self = StObject.set(x, "5xl", value.asInstanceOf[js.Any])
      
      inline def set5xlUndefined: Self = StObject.set(x, "5xl", js.undefined)
      
      inline def setInherit(value: T): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
      
      inline def setLg(value: T): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: T): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: T): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: T): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: T): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
}
