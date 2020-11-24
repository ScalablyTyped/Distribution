package typings.nodeZendesk.mod.Users.Fields

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Types of custom fields that can be created
  * @default 'text'
  */
/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.text
  - typings.nodeZendesk.nodeZendeskStrings.textarea
  - typings.nodeZendesk.nodeZendeskStrings.checkbox
  - typings.nodeZendesk.nodeZendeskStrings.date
  - typings.nodeZendesk.nodeZendeskStrings.integer
  - typings.nodeZendesk.nodeZendeskStrings.decimal
  - typings.nodeZendesk.nodeZendeskStrings.regexp
  - typings.nodeZendesk.nodeZendeskStrings.tagger
*/
trait UserFieldType extends js.Object
object UserFieldType {
  
  @scala.inline
  def checkbox: typings.nodeZendesk.nodeZendeskStrings.checkbox = "checkbox".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.checkbox]
  
  @scala.inline
  def date: typings.nodeZendesk.nodeZendeskStrings.date = "date".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.date]
  
  @scala.inline
  def decimal: typings.nodeZendesk.nodeZendeskStrings.decimal = "decimal".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.decimal]
  
  @scala.inline
  def integer: typings.nodeZendesk.nodeZendeskStrings.integer = "integer".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.integer]
  
  @scala.inline
  def regexp: typings.nodeZendesk.nodeZendeskStrings.regexp = "regexp".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.regexp]
  
  @scala.inline
  def tagger: typings.nodeZendesk.nodeZendeskStrings.tagger = "tagger".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.tagger]
  
  @scala.inline
  def text: typings.nodeZendesk.nodeZendeskStrings.text = "text".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.text]
  
  @scala.inline
  def textarea: typings.nodeZendesk.nodeZendeskStrings.textarea = "textarea".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.textarea]
}
