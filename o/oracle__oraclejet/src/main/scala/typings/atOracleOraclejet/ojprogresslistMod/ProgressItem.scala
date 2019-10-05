package typings.atOracleOraclejet.ojprogresslistMod

import typings.atOracleOraclejet.ojprogresslistMod.ProgressItem.EventType
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressItem extends js.Object {
  def addEventListener(eventType: EventType, listener: EventListener): Unit
  def removeEventListener(eventType: EventType, listener: EventListener): Unit
}

@JSImport("@oracle/oraclejet/ojprogresslist", "ProgressItem")
@js.native
object ProgressItem extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atOracleOraclejet.atOracleOraclejetStrings.loadstart
    - typings.atOracleOraclejet.atOracleOraclejetStrings.progress
    - typings.atOracleOraclejet.atOracleOraclejetStrings.abort
    - typings.atOracleOraclejet.atOracleOraclejetStrings.error
    - typings.atOracleOraclejet.atOracleOraclejetStrings.load
    - typings.atOracleOraclejet.atOracleOraclejetStrings.timeout
    - typings.atOracleOraclejet.atOracleOraclejetStrings.loadend
  */
  trait EventType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atOracleOraclejet.atOracleOraclejetStrings.queued
    - typings.atOracleOraclejet.atOracleOraclejetStrings.loadstarted
    - typings.atOracleOraclejet.atOracleOraclejetStrings.aborted
    - typings.atOracleOraclejet.atOracleOraclejetStrings.errored
    - typings.atOracleOraclejet.atOracleOraclejetStrings.timedout
    - typings.atOracleOraclejet.atOracleOraclejetStrings.loaded
  */
  trait Status extends js.Object
  
}

