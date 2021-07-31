package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextNumbers.`301`
import typings.next.nextNumbers.`302`
import typings.next.nextNumbers.`303`
import typings.next.nextNumbers.`307`
import typings.next.nextNumbers.`308`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination
  extends StObject
     with typings.next.mod.Redirect {
  
  var basePath: js.UndefOr[`false`] = js.undefined
  
  var destination: String
  
  var statusCode: `301` | `302` | `303` | `307` | `308`
}
object Destination {
  
  @scala.inline
  def apply(destination: String, statusCode: `301` | `302` | `303` | `307` | `308`): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: `301` | `302` | `303` | `307` | `308`): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
