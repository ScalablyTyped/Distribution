package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.AttributeToProjector
import typings.plottable.buildSrcCoreInterfacesMod.Projector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMemoizeMemoizeProjectorsMod {
  
  @JSImport("plottable/build/src/memoize/memoizeProjectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoizeProjector(projector: Projector): Projector = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeProjector")(projector.asInstanceOf[js.Any]).asInstanceOf[Projector]
  
  inline def memoizeProjectors(attrToProjector: AttributeToProjector): AttributeToProjector = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeProjectors")(attrToProjector.asInstanceOf[js.Any]).asInstanceOf[AttributeToProjector]
}
