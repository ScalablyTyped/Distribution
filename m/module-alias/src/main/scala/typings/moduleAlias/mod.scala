package typings.moduleAlias

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Import aliases from package.json
    */
  @scala.inline
  def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  @scala.inline
  def apply(options: String): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("module-alias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Register a single alias
    */
  @scala.inline
  def addAlias(alias: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAlias")(alias.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Register mutliple aliases
    */
  @scala.inline
  def addAliases(aliases: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAliases")(aliases.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Register a custom modules directory
    */
  @scala.inline
  def addPath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isPathMatchesAlias(path: String, alias: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathMatchesAlias")(path.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Reset any changes maded (resets all registered aliases
    * and custom module directories)
    * The function is undocumented and for testing purposes only
    */
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  /**
    * module intialis options type
    */
  trait Options extends StObject {
    
    var base: String
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
