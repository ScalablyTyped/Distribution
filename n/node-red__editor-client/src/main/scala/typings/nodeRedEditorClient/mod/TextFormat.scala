package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Dir
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.email
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.filepath
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.url
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFormat extends StObject {
  
  /*
    * Handle Structured text correct display for a given HTML element.
    * @param element - the element  : should be of type div contenteditable=true
    * @param type - could be one of filepath, url, email
    * @param args - pass additional arguments to the handler. generally null.
    * @param isRtl - indicates if the GUI is mirrored
    * @param locale - the browser locale
    */
  def attach(element: HTMLDivElement, `type`: filepath | url | email, args: Any, isRtl: Boolean, locale: String): Boolean = js.native
  
  def getHtml(text: String, `type`: String, args: Null, isRtl: Boolean, locale: String): String = js.native
  /*
    * Returns the HTML representation of a given structured text
    * @param text - the structured text
    * @param type - could be one of filepath, url, email
    * @param args - pass additional arguments to the handler. generally null.
    * @param isRtl - indicates if the GUI is mirrored
    * @param locale - the browser locale
    */
  def getHtml(text: String, `type`: String, args: Dir, isRtl: Boolean, locale: String): String = js.native
}
