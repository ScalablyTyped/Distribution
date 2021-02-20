package typings.moduleAlias

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Import aliases from package.json
    */
  @JSImport("module-alias", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("module-alias", JSImport.Namespace)
  @js.native
  def apply(options: String): Unit = js.native
  @JSImport("module-alias", JSImport.Namespace)
  @js.native
  def apply(options: Options): Unit = js.native
  
  /**
    * Register a single alias
    */
  @JSImport("module-alias", "addAlias")
  @js.native
  def addAlias(alias: String, path: String): Unit = js.native
  
  /**
    * Register mutliple aliases
    */
  @JSImport("module-alias", "addAliases")
  @js.native
  def addAliases(aliases: StringDictionary[String]): Unit = js.native
  
  /**
    * Register a custom modules directory
    */
  @JSImport("module-alias", "addPath")
  @js.native
  def addPath(path: String): Unit = js.native
  
  @JSImport("module-alias", "isPathMatchesAlias")
  @js.native
  def isPathMatchesAlias(path: String, alias: String): Boolean = js.native
  
  /**
    * Reset any changes maded (resets all registered aliases
    * and custom module directories)
    * The function is undocumented and for testing purposes only
    */
  @JSImport("module-alias", "reset")
  @js.native
  def reset(): Unit = js.native
  
  /**
    * module intialis options type
    */
  @js.native
  trait Options extends StObject {
    
    var base: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(base: String): Options = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    }
  }
}
