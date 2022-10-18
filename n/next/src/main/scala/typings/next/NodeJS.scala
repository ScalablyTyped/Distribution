package typings.next

import typings.next.nextStrings.development
import typings.next.nextStrings.production
import typings.next.nextStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Extend the NodeJS namespace with Next.js-defined properties
object NodeJS {
  
  trait Process extends StObject {
    
    /**
      * @deprecated Use `typeof window` instead
      */
    val browser: Boolean
  }
  object Process {
    
    inline def apply(browser: Boolean): Process = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Process]
    }
    
    extension [Self <: Process](x: Self) {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessEnv extends StObject {
    
    val NODE_ENV: development | production | test
  }
  object ProcessEnv {
    
    inline def apply(NODE_ENV: development | production | test): ProcessEnv = {
      val __obj = js.Dynamic.literal(NODE_ENV = NODE_ENV.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessEnv]
    }
    
    extension [Self <: ProcessEnv](x: Self) {
      
      inline def setNODE_ENV(value: development | production | test): Self = StObject.set(x, "NODE_ENV", value.asInstanceOf[js.Any])
    }
  }
}
