package typings.nivoRecompose

import typings.nivoRecompose.typesMod.DefaultingInferableComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultPropsMod {
  
  @JSImport("@nivo/recompose/dist/types/defaultProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultProps[T](props: T): DefaultingInferableComponentEnhancer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProps")(props.asInstanceOf[js.Any]).asInstanceOf[DefaultingInferableComponentEnhancer[T]]
}
