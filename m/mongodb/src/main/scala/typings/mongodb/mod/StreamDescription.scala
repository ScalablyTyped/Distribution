package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "StreamDescription")
@js.native
open class StreamDescription protected () extends StObject {
  def this(address: String) = this()
  def this(address: String, options: StreamDescriptionOptions) = this()
  
  var __nodejs_mock_server__ : js.UndefOr[Boolean] = js.native
  
  var address: String = js.native
  
  var compressor: js.UndefOr[CompressorName] = js.native
  
  var compressors: js.Array[CompressorName] = js.native
  
  var loadBalanced: Boolean = js.native
  
  var logicalSessionTimeoutMinutes: js.UndefOr[scala.Double] = js.native
  
  var maxBsonObjectSize: scala.Double = js.native
  
  var maxMessageSizeBytes: scala.Double = js.native
  
  var maxWireVersion: js.UndefOr[scala.Double] = js.native
  
  var maxWriteBatchSize: scala.Double = js.native
  
  var minWireVersion: js.UndefOr[scala.Double] = js.native
  
  def receiveResponse(): Unit = js.native
  def receiveResponse(response: Document): Unit = js.native
  
  var `type`: String = js.native
  
  var zlibCompressionLevel: js.UndefOr[scala.Double] = js.native
}
