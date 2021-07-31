package typings.node.fsMod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realpath {
  
  @scala.inline
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: BaseEncodingOptions,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fs", "realpath")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: BaseEncodingOptions,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
