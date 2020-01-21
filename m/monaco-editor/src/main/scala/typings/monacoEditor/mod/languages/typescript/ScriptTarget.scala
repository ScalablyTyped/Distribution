package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptTarget extends js.Object

@JSImport("monaco-editor", "languages.typescript.ScriptTarget")
@js.native
object ScriptTarget extends js.Object {
  @js.native
  sealed trait ES2015 extends ScriptTarget
  
  @js.native
  sealed trait ES2016 extends ScriptTarget
  
  @js.native
  sealed trait ES2017 extends ScriptTarget
  
  @js.native
  sealed trait ES2018 extends ScriptTarget
  
  @js.native
  sealed trait ES2019 extends ScriptTarget
  
  @js.native
  sealed trait ES2020 extends ScriptTarget
  
  @js.native
  sealed trait ES3 extends ScriptTarget
  
  @js.native
  sealed trait ES5 extends ScriptTarget
  
  @js.native
  sealed trait ESNext extends ScriptTarget
  
  @js.native
  sealed trait JSON extends ScriptTarget
  
  @js.native
  sealed trait Latest extends ScriptTarget
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptTarget with Double] = js.native
  /* 2 */ @js.native
  object ES2015 extends TopLevel[ES2015 with Double]
  
  /* 3 */ @js.native
  object ES2016 extends TopLevel[ES2016 with Double]
  
  /* 4 */ @js.native
  object ES2017 extends TopLevel[ES2017 with Double]
  
  /* 5 */ @js.native
  object ES2018 extends TopLevel[ES2018 with Double]
  
  /* 6 */ @js.native
  object ES2019 extends TopLevel[ES2019 with Double]
  
  /* 7 */ @js.native
  object ES2020 extends TopLevel[ES2020 with Double]
  
  /* 0 */ @js.native
  object ES3 extends TopLevel[ES3 with Double]
  
  /* 1 */ @js.native
  object ES5 extends TopLevel[ES5 with Double]
  
  /* 99 */ @js.native
  object ESNext extends TopLevel[ESNext with Double]
  
  /* 100 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  /* 99 */ @js.native
  object Latest extends TopLevel[Latest with Double]
  
}

