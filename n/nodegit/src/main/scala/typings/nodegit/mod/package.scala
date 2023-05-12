package typings.nodegit.mod

import typings.nodegit.mod.^
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Clone(url: String, localPath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
inline def Clone(url: String, localPath: String, options: typings.nodegit.cloneOptionsMod.CloneOptions): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]

inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
