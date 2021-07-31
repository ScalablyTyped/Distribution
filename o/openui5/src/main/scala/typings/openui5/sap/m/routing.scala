package typings.openui5.sap.m

import typings.openui5.sap.ui.base.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routing {
  
  trait RouteMatchedHandler extends StObject {
    
    /**
      * Removes the routeMatchedHandler from the Router
      * @returns for chaining
      */
    def destroy(): RouteMatchedHandler
    
    /**
      * Gets if a navigation should close dialogs
      * @returns a flag indication if dialogs will be closed
      */
    def getCloseDialogs(): Boolean
    
    /**
      * Returns a metadata object for class sap.m.routing.RouteMatchedHandler.
      * @returns Metadata object describing this class
      */
    def getMetadata(): Metadata
    
    /**
      * Sets if a navigation should close dialogs
      * @param bCloseDialogs close dialogs if true
      * @returns for chaining
      */
    def setCloseDialogs(bCloseDialogs: Boolean): RouteMatchedHandler
  }
  object RouteMatchedHandler {
    
    @scala.inline
    def apply(
      destroy: () => RouteMatchedHandler,
      getCloseDialogs: () => Boolean,
      getMetadata: () => Metadata,
      setCloseDialogs: Boolean => RouteMatchedHandler
    ): RouteMatchedHandler = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getCloseDialogs = js.Any.fromFunction0(getCloseDialogs), getMetadata = js.Any.fromFunction0(getMetadata), setCloseDialogs = js.Any.fromFunction1(setCloseDialogs))
      __obj.asInstanceOf[RouteMatchedHandler]
    }
    
    @scala.inline
    implicit class RouteMatchedHandlerMutableBuilder[Self <: RouteMatchedHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => RouteMatchedHandler): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCloseDialogs(value: () => Boolean): Self = StObject.set(x, "getCloseDialogs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMetadata(value: () => Metadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetCloseDialogs(value: Boolean => RouteMatchedHandler): Self = StObject.set(x, "setCloseDialogs", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Router
    extends StObject
       with typings.openui5.sap.ui.core.routing.Router {
    
    /**
      * Returns the TargetHandler instance.
      * @returns the TargetHandler instance
      */
    def getTargetHandler(): TargetHandler = js.native
  }
  
  trait TargetHandler extends StObject {
    
    /**
      * Gets if a navigation should close dialogs
      * @returns a flag indication if dialogs will be closed
      */
    def getCloseDialogs(): Boolean
    
    /**
      * Returns a metadata object for class sap.m.routing.TargetHandler.
      * @returns Metadata object describing this class
      */
    def getMetadata(): Metadata
    
    /**
      * Sets if a navigation should close dialogs
      * @param bCloseDialogs close dialogs if true
      * @returns for chaining
      */
    def setCloseDialogs(bCloseDialogs: Boolean): TargetHandler
  }
  object TargetHandler {
    
    @scala.inline
    def apply(
      getCloseDialogs: () => Boolean,
      getMetadata: () => Metadata,
      setCloseDialogs: Boolean => TargetHandler
    ): TargetHandler = {
      val __obj = js.Dynamic.literal(getCloseDialogs = js.Any.fromFunction0(getCloseDialogs), getMetadata = js.Any.fromFunction0(getMetadata), setCloseDialogs = js.Any.fromFunction1(setCloseDialogs))
      __obj.asInstanceOf[TargetHandler]
    }
    
    @scala.inline
    implicit class TargetHandlerMutableBuilder[Self <: TargetHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCloseDialogs(value: () => Boolean): Self = StObject.set(x, "getCloseDialogs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMetadata(value: () => Metadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetCloseDialogs(value: Boolean => TargetHandler): Self = StObject.set(x, "setCloseDialogs", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Targets
    extends StObject
       with typings.openui5.sap.ui.core.routing.Targets {
    
    /**
      * Returns the TargetHandler instance.
      * @returns the TargetHandler instance
      */
    def getTargetHandler(): TargetHandler = js.native
  }
}
