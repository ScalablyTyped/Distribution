package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Migration")
@js.native
object MigrationNs extends js.Object {
  @js.native
  class Manager protected ()
    extends orientjsLib.orientjsMod.orientjsNs.MigrationNs.Manager {
    def this(config: orientjsLib.orientjsMod.orientjsNs.MigrationNs.MigrationManagerConfig) = this()
  }
  
  @js.native
  class Migration ()
    extends orientjsLib.orientjsMod.orientjsNs.MigrationNs.Migration
  
  @js.native
  class MigrationManager ()
    extends orientjsLib.orientjsMod.orientjsNs.MigrationNs.MigrationManager {
    /**
                 * # Migration Manager
                 *
                 * @param config The configuration for the migration manager.
                 */
    def this(config: orientjsLib.orientjsMod.orientjsNs.MigrationNs.MigrationManagerConfig) = this()
  }
  
}

