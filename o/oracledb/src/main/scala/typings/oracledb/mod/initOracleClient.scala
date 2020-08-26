package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oracledb", "initOracleClient")
@js.native
object initOracleClient extends js.Object {
  /**
    * This synchronous function loads and initializes the Oracle Client libraries that are necessary
    * for node-oracledb to communicate with Oracle Database. This function is optional. If used, it
    * should be the first node-oracledb call made by an application.
    * 
    * If initOracleClient() is not called, then the Oracle Client libraries are loaded at the time of
    * first use in the application, such as when creating a connection pool. The default values described
    * for options will be used in this case.
    * 
    * If the Oracle Client libraries cannot be loaded, or they have already been initialized, either by a
    * previous call to this function or because another function call already required the Oracle Client libraries,
    * then initOracleClient() raises an exception.
    * 
    * On Linux, ensure a libclntsh.so file exists. On macOS ensure a libclntsh.dylib file exists.
    * Node-oracledb will not directly load libclntsh.*.XX.1 files in libDir. Note other libraries used by libclntsh* are also required.
    * 
    * On Linux, using libDir is only useful for forcing initOracleClient() to immediately load the Oracle Client libraries because
    * those libraries still need to be in the operating system search path, such as from running ldconfig or set in the environment
    * variable LD_LIBRARY_PATH.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#initnodeoracledb
    * @since 5.0
    */
  def apply(): Unit = js.native
  def apply(opts: InitialiseOptions): Unit = js.native
}

