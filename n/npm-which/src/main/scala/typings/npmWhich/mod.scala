package typings.npmWhich

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("npm-which", JSImport.Namespace)
  @js.native
  val ^ : StaticWhich = js.native
  
  @js.native
  trait InnerWhich extends StObject {
    
    /**
      * Creates a searcher for the specified command.
      *
      * @param options
      * The options for searching the command.
      */
    def apply(): InnerWhich = js.native
    /**
      * Searches for the command.
      *
      * @param callback
      * A callback for handling the result.
      */
    def apply(callback: NpmWhichCallback): Unit = js.native
    def apply(options: NpmWhichOptions): InnerWhich = js.native
    /**
      * Searches for the command.
      *
      * @param options
      * The options for searching the command.
      *
      * @param callback
      * A callback for handling the result.
      */
    def apply(options: NpmWhichOptions, callback: NpmWhichCallback): Unit = js.native
    
    /**
      * Searches for the command.
      *
      * @param options
      * The options for searching the command.
      */
    def sync(): String = js.native
    def sync(options: NpmWhichOptions): String = js.native
  }
  
  /**
    * Provides the functionality to search for a command.
    */
  @js.native
  trait NpmWhich extends WhichBase[NpmWhichOptions] {
    
    /**
      * Searches for the specified command.
      *
      * @param cmd
      * The command to look for.
      *
      * @param options
      * The options for searching the command.
      */
    def sync(cmd: String): String = js.native
    def sync(cmd: String, options: StaticWhichOptions): String = js.native
  }
  
  /**
    * Represents a callback for handling the result of `NpmWhich`.
    */
  type NpmWhichCallback = js.Function2[/* error */ String, /* result */ String, Unit]
  
  /**
    * Provides options for the `npmwhich`-module.
    */
  @js.native
  trait NpmWhichOptions extends StObject {
    
    /**
      * The directory to find the binary for.
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * The environment to use for resolving the binary.
      */
    var env: js.UndefOr[ProcessEnv] = js.native
  }
  object NpmWhichOptions {
    
    @scala.inline
    def apply(): NpmWhichOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NpmWhichOptions]
    }
    
    @scala.inline
    implicit class NpmWhichOptionsMutableBuilder[Self <: NpmWhichOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  /**
    * Represents the static instance of `npm-which`.
    */
  @js.native
  trait StaticWhich extends WhichBase[StaticWhichOptions] {
    
    /**
      * Initializes an `NpmWhich`-instance for the specified working-directory.
      *
      * @param cwd
      * The working-directory to browse.
      */
    def apply(): NpmWhich = js.native
    
    /**
      * Searches for the specified command.
      *
      * @param cmd
      * The command to look for.
      *
      * @param options
      * The options for searching the command.
      */
    def sync(cmd: String, options: StaticWhichOptions): String = js.native
  }
  
  /**
    * Provides options for the `npmwhich`-module.
    */
  @js.native
  trait StaticWhichOptions extends StObject {
    
    /**
      * The directory to find the binary for.
      */
    var cwd: String = js.native
    
    /**
      * The environment to use for resolving the binary.
      */
    var env: js.UndefOr[ProcessEnv] = js.native
  }
  object StaticWhichOptions {
    
    @scala.inline
    def apply(cwd: String): StaticWhichOptions = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticWhichOptions]
    }
    
    @scala.inline
    implicit class StaticWhichOptionsMutableBuilder[Self <: StaticWhichOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  /**
    * Represents a basic interface for `npm-which`.
    */
  @js.native
  trait WhichBase[TOptions] extends StObject {
    
    /**
      * Creates a searcher for the specified command.
      *
      * @param cmd
      * The command to look for.
      *
      * @param options
      * The default options.
      *
      * @return
      * A searcher for the specified command.
      */
    def apply(cmd: String): InnerWhich = js.native
    /**
      * Searches for the specified command.
      *
      * @param cmd
      * The command to look for.
      *
      * @param callback
      * A callback for handling the result.
      */
    def apply(cmd: String, callback: NpmWhichCallback): Unit = js.native
    def apply(cmd: String, options: TOptions): InnerWhich = js.native
    /**
      * Searches for the specified command.
      *
      * @param cmd
      * The command to look for.
      *
      * @param options
      * The options for searching the command.
      *
      * @param callback
      * A callback for handling the result.
      */
    def apply(cmd: String, options: TOptions, callback: NpmWhichCallback): Unit = js.native
  }
  
  type _To = StaticWhich
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: StaticWhich = ^
}
