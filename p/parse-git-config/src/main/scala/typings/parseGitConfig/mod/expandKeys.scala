package typings.parseGitConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse-git-config", "expandKeys")
@js.native
object expandKeys extends js.Object {
  
  /**
    * Returns an object with only the properties that had ini-style keys
    * converted to objects.
    *
    * @example ```js
    * const config = parse.sync({ path: '/path/to/.gitconfig' });
    * const obj = parse.expandKeys(config);
    * ```
    * @param config The parsed git config object.
    */
  def apply(config: Config): Config = js.native
}
