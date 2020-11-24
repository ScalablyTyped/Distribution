package typings.metismenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metismenuStrings {
  
  @scala.inline
  def dispose: dispose = "dispose".asInstanceOf[dispose]
  
  @scala.inline
  def hiddenDotmetisMenu: hiddenDotmetisMenu = "hidden.metisMenu".asInstanceOf[hiddenDotmetisMenu]
  
  @scala.inline
  def hideDotmetisMenu: hideDotmetisMenu = "hide.metisMenu".asInstanceOf[hideDotmetisMenu]
  
  @scala.inline
  def showDotmetisMenu: showDotmetisMenu = "show.metisMenu".asInstanceOf[showDotmetisMenu]
  
  @scala.inline
  def shownDotmetisMenu: shownDotmetisMenu = "shown.metisMenu".asInstanceOf[shownDotmetisMenu]
  
  @js.native
  sealed trait dispose extends js.Object
  
  @js.native
  sealed trait hiddenDotmetisMenu extends MetisMenuEvents
  
  @js.native
  sealed trait hideDotmetisMenu extends MetisMenuEvents
  
  @js.native
  sealed trait showDotmetisMenu extends MetisMenuEvents
  
  @js.native
  sealed trait shownDotmetisMenu extends MetisMenuEvents
}
