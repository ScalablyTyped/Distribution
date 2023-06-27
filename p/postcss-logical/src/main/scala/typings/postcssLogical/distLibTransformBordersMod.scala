package typings.postcssLogical

import typings.postcss.mod.Declaration
import typings.postcssLogical.distLibTypesMod.DirectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformBordersMod {
  
  @JSImport("postcss-logical/dist/lib/transform-borders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformBorder(borderSetting: String, side: String): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformBorder")(borderSetting.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
  
  inline def transformBorderProperty(borderSetting: String, side: js.Tuple2[String, String]): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformBorderProperty")(borderSetting.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
  
  inline def transformBorderRadius(config: DirectionConfig): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformBorderRadius")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
  
  inline def transformBorderShorthand(side: js.Array[String]): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformBorderShorthand")(side.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
  inline def transformBorderShorthand(side: js.Tuple2[String, String]): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformBorderShorthand")(side.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
}
