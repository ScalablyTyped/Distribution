package typings.nomnom.NomnomInternal.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  /**
    * The abbreviated name of the option.
    */
  var abbr: js.UndefOr[String] = js.native
  
  /**
    * A callback for the option.
    */
  var callback: js.UndefOr[js.Function1[/* option */ js.Any, String]] = js.native
  
  /**
    * The choices for the option.
    */
  var choices: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The default value of the option.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * Whether the option is a flag.
    */
  var flag: js.UndefOr[Boolean] = js.native
  
  /**
    * The full name of the option.
    */
  var full: js.UndefOr[String] = js.native
  
  /**
    * A help string for the option.
    */
  var help: js.UndefOr[String] = js.native
  
  /**
    * Whether the option is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the option is a list.
    */
  var list: js.UndefOr[Boolean] = js.native
  
  /**
    * A string to be used in the usage printout.
    */
  var metavar: js.UndefOr[String] = js.native
  
  /**
    * The position of the option if it's a positional argument.
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * Whether the option is required.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * A shorthand for abbr, full, and metavar.
    */
  var string: js.UndefOr[String] = js.native
  
  /**
    * If you don't want the option JSON-parsed, specify type "string".
    */
  var `type`: js.UndefOr[String] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbbr(value: String): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbbr: Self = this.set("abbr", js.undefined)
    
    @scala.inline
    def setCallback(value: /* option */ js.Any => String): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setChoicesVarargs(value: String*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[String]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setFlag(value: Boolean): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setList(value: Boolean): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setMetavar(value: String): Self = this.set("metavar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetavar: Self = this.set("metavar", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
