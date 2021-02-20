package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* was `typeof Promise` */
  @scala.inline
  def Promise: typings.std.PromiseConstructor = typings.nodegit.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Promise").asInstanceOf[typings.std.PromiseConstructor]
  @scala.inline
  def Promise_=(x: typings.std.PromiseConstructor): scala.Unit = typings.nodegit.mod.^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def version: java.lang.String = typings.nodegit.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
