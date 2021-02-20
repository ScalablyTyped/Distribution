package typings.next

import typings.next.nextServerMod.NextConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextMod {
  
  @JSImport("next/dist/server/next", JSImport.Default)
  @js.native
  def default(options: NextServerConstructor): typings.next.nextServerMod.default = js.native
  
  /* Inlined next.next/dist/next-server/server/next-server.ServerConstructor & {  dev :boolean | undefined} */
  @js.native
  trait NextServerConstructor extends StObject {
    
    /**
      * Object what you would use in next.config.js - @default {}
      */
    var conf: js.UndefOr[NextConfig] = js.native
    
    var customServer: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to launch Next.js in dev mode - @default false
      */
    var dev: js.UndefOr[Boolean] = js.native
    
    /**
      * Where the Next project is located - @default '.'
      */
    var dir: js.UndefOr[String] = js.native
    
    /**
      * Hide error messages containing server information - @default false
      */
    var quiet: js.UndefOr[Boolean] = js.native
  }
  object NextServerConstructor {
    
    @scala.inline
    def apply(): NextServerConstructor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextServerConstructor]
    }
    
    @scala.inline
    implicit class NextServerConstructorMutableBuilder[Self <: NextServerConstructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConf(value: NextConfig): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
      
      @scala.inline
      def setCustomServer(value: Boolean): Self = StObject.set(x, "customServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomServerUndefined: Self = StObject.set(x, "customServer", js.undefined)
      
      @scala.inline
      def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
