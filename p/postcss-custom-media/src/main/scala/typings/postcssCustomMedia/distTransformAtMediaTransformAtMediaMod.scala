package typings.postcssCustomMedia

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQuery
import typings.postcssCustomMedia.anon.EncapsulateWith
import typings.postcssCustomMedia.anon.Falsy
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformAtMediaTransformAtMediaMod {
  
  @JSImport("postcss-custom-media/dist/transform-at-media/transform-at-media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformAtMediaListTokens(params: String, replacements: Map[String, Falsy]): js.Array[EncapsulateWith] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAtMediaListTokens")(params.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[js.Array[EncapsulateWith]]
  
  inline def transformComplexMediaQuery(mediaQuery: MediaQuery, replacements: Map[String, Falsy]): js.Array[EncapsulateWith] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformComplexMediaQuery")(mediaQuery.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[js.Array[EncapsulateWith]]
  
  inline def transformSimpleMediaQuery(mediaQuery: MediaQuery, replacements: Map[String, Falsy]): EncapsulateWith | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSimpleMediaQuery")(mediaQuery.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[EncapsulateWith | Null]
}
