package typings.nodeHtmlParser

import typings.nodeHtmlParser.htmlMod.InsertPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHtmlParserStrings {
  
  @js.native
  sealed trait afterbegin extends InsertPosition
  @scala.inline
  def afterbegin: afterbegin = "afterbegin".asInstanceOf[afterbegin]
  
  @js.native
  sealed trait afterend extends InsertPosition
  @scala.inline
  def afterend: afterend = "afterend".asInstanceOf[afterend]
  
  @js.native
  sealed trait beforebegin extends InsertPosition
  @scala.inline
  def beforebegin: beforebegin = "beforebegin".asInstanceOf[beforebegin]
  
  @js.native
  sealed trait beforeend extends InsertPosition
  @scala.inline
  def beforeend: beforeend = "beforeend".asInstanceOf[beforeend]
}
