package typings.micromarkFactoryMdxExpression

import typings.acorn.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-mdx-expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryMdxExpression(
    effects: Effects,
    ok: State,
    `type`: String,
    markerType: String,
    chunkType: String,
    acorn: js.UndefOr[typings.micromarkUtilEventsToAcorn.mod.Acorn],
    acornOptions: js.UndefOr[Options],
    addResult: js.UndefOr[Boolean],
    spread: js.UndefOr[Boolean],
    allowEmpty: js.UndefOr[Boolean],
    allowLazy: js.UndefOr[Boolean],
    startColumn: js.UndefOr[Double]
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryMdxExpression")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], chunkType.asInstanceOf[js.Any], acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any], spread.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowLazy.asInstanceOf[js.Any], startColumn.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type Acorn = typings.micromarkUtilEventsToAcorn.mod.Acorn
  
  type AcornOptions = typings.micromarkUtilEventsToAcorn.mod.AcornOptions
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  type Point = typings.micromarkUtilTypes.mod.Point
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
}
