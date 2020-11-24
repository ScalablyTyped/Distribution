package typings.nodeHtmlParser

import typings.nodeHtmlParser.htmlMod.InsertPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHtmlParserStrings {
  
  @scala.inline
  def afterbegin: afterbegin = "afterbegin".asInstanceOf[afterbegin]
  
  @scala.inline
  def afterend: afterend = "afterend".asInstanceOf[afterend]
  
  @scala.inline
  def beforebegin: beforebegin = "beforebegin".asInstanceOf[beforebegin]
  
  @scala.inline
  def beforeend: beforeend = "beforeend".asInstanceOf[beforeend]
  
  @js.native
  sealed trait afterbegin extends InsertPosition
  
  @js.native
  sealed trait afterend extends InsertPosition
  
  @js.native
  sealed trait beforebegin extends InsertPosition
  
  @js.native
  sealed trait beforeend extends InsertPosition
}
