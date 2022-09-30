package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ServerCapabilities")
@js.native
open class ServerCapabilities protected () extends StObject {
  def this(hello: Document) = this()
  
  def commandsTakeCollation: Boolean = js.native
  
  def commandsTakeWriteConcern: Boolean = js.native
  
  def hasAggregationCursor: Boolean = js.native
  
  def hasAuthCommands: Boolean = js.native
  
  def hasListCollectionsCommand: Boolean = js.native
  
  def hasListIndexesCommand: Boolean = js.native
  
  def hasTextSearch: Boolean = js.native
  
  def hasWriteCommands: Boolean = js.native
  
  var maxWireVersion: scala.Double = js.native
  
  var minWireVersion: scala.Double = js.native
  
  def supportsSnapshotReads: Boolean = js.native
}
