package typings.mjmlReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mjml-react/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addQueryParams(url: String, params: StringDictionary[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryParams")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fixConditionalComment(html: String, havingContent: String, newCondition: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixConditionalComment")(html.asInstanceOf[js.Any], havingContent.asInstanceOf[js.Any], newCondition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTextAlign(value: String): TextAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextAlign")(value.asInstanceOf[js.Any]).asInstanceOf[TextAlignment]
  inline def getTextAlign(value: String, fallback: TextAlignment): TextAlignment = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextAlign")(value.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[TextAlignment]
  
  inline def namedEntityToHexCode(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namedEntityToHexCode")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def renderToJson(whatToRender: ReactNode): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToJson")(whatToRender.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def renderToJson2(whatToRender: ReactNode): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToJson2")(whatToRender.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def toMobileFontSize(sizeWithUnit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMobileFontSize")(sizeWithUnit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def useHttps(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHttps")().asInstanceOf[js.UndefOr[String]]
  inline def useHttps(url: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHttps")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mjmlReact.mjmlReactStrings.left
    - typings.mjmlReact.mjmlReactStrings.right
    - typings.mjmlReact.mjmlReactStrings.center
    - typings.mjmlReact.mjmlReactStrings.justify
    - typings.mjmlReact.mjmlReactStrings.inherit
  */
  trait TextAlignment extends StObject
  object TextAlignment {
    
    inline def center: typings.mjmlReact.mjmlReactStrings.center = "center".asInstanceOf[typings.mjmlReact.mjmlReactStrings.center]
    
    inline def inherit: typings.mjmlReact.mjmlReactStrings.inherit = "inherit".asInstanceOf[typings.mjmlReact.mjmlReactStrings.inherit]
    
    inline def justify: typings.mjmlReact.mjmlReactStrings.justify = "justify".asInstanceOf[typings.mjmlReact.mjmlReactStrings.justify]
    
    inline def left: typings.mjmlReact.mjmlReactStrings.left = "left".asInstanceOf[typings.mjmlReact.mjmlReactStrings.left]
    
    inline def right: typings.mjmlReact.mjmlReactStrings.right = "right".asInstanceOf[typings.mjmlReact.mjmlReactStrings.right]
  }
}
