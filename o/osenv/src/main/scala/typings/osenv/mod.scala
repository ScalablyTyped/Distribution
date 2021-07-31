package typings.osenv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("osenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def editor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("editor")().asInstanceOf[String]
  @scala.inline
  def editor(cb: js.Function2[/* editor */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("editor")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def home(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("home")().asInstanceOf[String]
  @scala.inline
  def home(cb: js.Function2[/* home */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("home")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hostname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostname")().asInstanceOf[String]
  @scala.inline
  def hostname(cb: js.Function2[/* hostname */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostname")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def path(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")().asInstanceOf[String]
  @scala.inline
  def path(cb: js.Function2[/* path */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def prompt(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")().asInstanceOf[String]
  @scala.inline
  def prompt(cb: js.Function2[/* prompt */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def shell(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shell")().asInstanceOf[String]
  @scala.inline
  def shell(cb: js.Function2[/* shell */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shell")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def tmpdir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")().asInstanceOf[String]
  @scala.inline
  def tmpdir(cb: js.Function2[/* tmpdir */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpdir")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def user(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[String]
  @scala.inline
  def user(cb: js.Function2[/* user */ String, /* error */ js.UndefOr[String], Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("user")(cb.asInstanceOf[js.Any]).asInstanceOf[String]
}
