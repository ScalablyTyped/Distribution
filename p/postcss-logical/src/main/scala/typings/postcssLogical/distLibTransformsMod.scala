package typings.postcssLogical

import typings.postcssLogical.distLibTypesMod.Axes
import typings.postcssLogical.distLibTypesMod.DirectionConfig
import typings.postcssLogical.distLibTypesMod.TransformFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformsMod {
  
  @JSImport("postcss-logical/dist/lib/transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareTransforms(
    directionConfig: DirectionConfig,
    blockStart: Axes,
    blockEnd: Axes,
    inlineStart: Axes,
    inlineEnd: Axes
  ): Record[String, TransformFunction | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareTransforms")(directionConfig.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], blockEnd.asInstanceOf[js.Any], inlineStart.asInstanceOf[js.Any], inlineEnd.asInstanceOf[js.Any])).asInstanceOf[Record[String, TransformFunction | Null]]
}
