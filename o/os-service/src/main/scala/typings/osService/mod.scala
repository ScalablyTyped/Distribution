package typings.osService

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def add(name: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def add(name: String, opts: AddOptions, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def remove(name: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def run(stopCallback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(stopCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  @scala.inline
  def stop(rcode: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(rcode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AddOptions extends StObject {
    
    /**
      * An array of strings specifying other services this service depends on, this is optional
      */
    var dependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The services display name, defaults to the name parameter. T
      * his parameter will be used on Windows platforms only
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * An array of strings specifying parameters to pass to nodePath, defaults to []
      */
    var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The fully qualified path to the node binary used to run the service
      * (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
      */
    var nodePath: js.UndefOr[String] = js.undefined
    
    /**
      * See the username parameter
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * An array of strings specifying parameters to pass to programPath, defaults to []
      */
    var programArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The program to run using nodePath, defaults to the value of process.argv[1]
      */
    var programPath: js.UndefOr[String] = js.undefined
    
    /**
      * An array of numbers specifying Linux run-levels at which the service should be started
      * for Linux platforms, defaults to [2, 3, 4, 5], this is only used when chkconfig or
      * update-rc.d is used to install a service
      */
    var runLevels: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * For when systemd will be used a target can be specified for the WantedBy
      * attribute under the [Install] section in the generated systemd unit file,
      * defaults to multi-user.target
      */
    var systemdWantedBy: js.UndefOr[String] = js.undefined
    
    /**
      * For Windows platforms a username and password can be specified,
      * the service will be run using these credentials when started,
      * see the CreateService() functions win32 API documentation for
      * details on the format of the username, on all other platforms this parameter is ignored
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object AddOptions {
    
    @scala.inline
    def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    @scala.inline
    implicit class AddOptionsMutableBuilder[Self <: AddOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      @scala.inline
      def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value :_*))
      
      @scala.inline
      def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodePathUndefined: Self = StObject.set(x, "nodePath", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setProgramArgs(value: js.Array[String]): Self = StObject.set(x, "programArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramArgsUndefined: Self = StObject.set(x, "programArgs", js.undefined)
      
      @scala.inline
      def setProgramArgsVarargs(value: String*): Self = StObject.set(x, "programArgs", js.Array(value :_*))
      
      @scala.inline
      def setProgramPath(value: String): Self = StObject.set(x, "programPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramPathUndefined: Self = StObject.set(x, "programPath", js.undefined)
      
      @scala.inline
      def setRunLevels(value: js.Array[Double]): Self = StObject.set(x, "runLevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunLevelsUndefined: Self = StObject.set(x, "runLevels", js.undefined)
      
      @scala.inline
      def setRunLevelsVarargs(value: Double*): Self = StObject.set(x, "runLevels", js.Array(value :_*))
      
      @scala.inline
      def setSystemdWantedBy(value: String): Self = StObject.set(x, "systemdWantedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemdWantedByUndefined: Self = StObject.set(x, "systemdWantedBy", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
