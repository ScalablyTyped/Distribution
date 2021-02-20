package typings.mjmlReact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mjml-react/utils", "addQueryParams")
  @js.native
  def addQueryParams(url: String, params: StringDictionary[js.Any]): String = js.native
  
  @JSImport("mjml-react/utils", "fixConditionalComment")
  @js.native
  def fixConditionalComment(html: String, havingContent: String, newCondition: String): String = js.native
  
  @JSImport("mjml-react/utils", "getTextAlign")
  @js.native
  def getTextAlign(value: String): TextAlignment = js.native
  @JSImport("mjml-react/utils", "getTextAlign")
  @js.native
  def getTextAlign(value: String, fallback: TextAlignment): TextAlignment = js.native
  
  @JSImport("mjml-react/utils", "namedEntityToHexCode")
  @js.native
  def namedEntityToHexCode(html: String): String = js.native
  
  @JSImport("mjml-react/utils", "toMobileFontSize")
  @js.native
  def toMobileFontSize(sizeWithUnit: String): Double = js.native
  
  @JSImport("mjml-react/utils", "useHttps")
  @js.native
  def useHttps(): js.UndefOr[String] = js.native
  @JSImport("mjml-react/utils", "useHttps")
  @js.native
  def useHttps(url: String): js.UndefOr[String] = js.native
  
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
