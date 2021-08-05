package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubsubDestination extends StObject {
  
  /** The name of the Pub/Sub topic to publish job completion notification to. For example: `projects/{project}/topics/{topic}`. */
  var topic: js.UndefOr[String] = js.undefined
}
object PubsubDestination {
  
  inline def apply(): PubsubDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubDestination]
  }
  
  extension [Self <: PubsubDestination](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
