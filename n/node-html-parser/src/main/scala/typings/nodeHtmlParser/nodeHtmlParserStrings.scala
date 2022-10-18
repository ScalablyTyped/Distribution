package typings.nodeHtmlParser

import typings.nodeHtmlParser.distNodesHtmlMod.InsertPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHtmlParserStrings {
  
  @js.native
  sealed trait afterbegin
    extends StObject
       with InsertPosition
  inline def afterbegin: afterbegin = "afterbegin".asInstanceOf[afterbegin]
  
  @js.native
  sealed trait afterend
    extends StObject
       with InsertPosition
  inline def afterend: afterend = "afterend".asInstanceOf[afterend]
  
  @js.native
  sealed trait beforebegin
    extends StObject
       with InsertPosition
  inline def beforebegin: beforebegin = "beforebegin".asInstanceOf[beforebegin]
  
  @js.native
  sealed trait beforeend
    extends StObject
       with InsertPosition
  inline def beforeend: beforeend = "beforeend".asInstanceOf[beforeend]
}
