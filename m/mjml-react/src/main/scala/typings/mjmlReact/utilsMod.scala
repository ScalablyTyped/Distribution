package typings.mjmlReact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mjml-react/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addQueryParams(url: String, params: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryParams")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def fixConditionalComment(html: String, havingContent: String, newCondition: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixConditionalComment")(html.asInstanceOf[js.Any], havingContent.asInstanceOf[js.Any], newCondition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getTextAlign(value: String): TextAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextAlign")(value.asInstanceOf[js.Any]).asInstanceOf[TextAlignment]
  @scala.inline
  def getTextAlign(value: String, fallback: TextAlignment): TextAlignment = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextAlign")(value.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[TextAlignment]
  
  @scala.inline
  def namedEntityToHexCode(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namedEntityToHexCode")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toMobileFontSize(sizeWithUnit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMobileFontSize")(sizeWithUnit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def useHttps(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHttps")().asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def useHttps(url: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHttps")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mjmlReact.mjmlReactStrings.left
    - typings.mjmlReact.mjmlReactStrings.right
    - typings.mjmlReact.mjmlReactStrings.center
    - typings.mjmlReact.mjmlReactStrings.justify
    - typings.mjmlReact.mjmlReactStrings.inherit
  */
  trait TextAlignment extends StObject
  object TextAlignment {
    
    @scala.inline
    def center: typings.mjmlReact.mjmlReactStrings.center = "center".asInstanceOf[typings.mjmlReact.mjmlReactStrings.center]
    
    @scala.inline
    def inherit: typings.mjmlReact.mjmlReactStrings.inherit = "inherit".asInstanceOf[typings.mjmlReact.mjmlReactStrings.inherit]
    
    @scala.inline
    def justify: typings.mjmlReact.mjmlReactStrings.justify = "justify".asInstanceOf[typings.mjmlReact.mjmlReactStrings.justify]
    
    @scala.inline
    def left: typings.mjmlReact.mjmlReactStrings.left = "left".asInstanceOf[typings.mjmlReact.mjmlReactStrings.left]
    
    @scala.inline
    def right: typings.mjmlReact.mjmlReactStrings.right = "right".asInstanceOf[typings.mjmlReact.mjmlReactStrings.right]
  }
}
