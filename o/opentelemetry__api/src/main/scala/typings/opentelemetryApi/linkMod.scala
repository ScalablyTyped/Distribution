package typings.opentelemetryApi

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.linkContextMod.LinkContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  trait Link extends StObject {
    
    /** A set of {@link Attributes} on the link. */
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    /** The {@link LinkContext} of a linked span. */
    var context: LinkContext
  }
  object Link {
    
    @scala.inline
    def apply(context: LinkContext): Link = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setContext(value: LinkContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
