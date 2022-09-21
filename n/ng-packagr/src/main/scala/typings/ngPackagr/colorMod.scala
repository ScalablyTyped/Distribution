package typings.ngPackagr

import typings.ansiColors.mod.StyleFunction
import typings.ansiColors.mod.StyleType
import typings.ansiColors.mod.StylesType
import typings.ansiColors.mod.SymbolsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  /* was `typeof ansiColors` */
  object colors {
    
    @JSImport("ng-packagr/lib/utils/color", "colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.ansiRegex")
    @js.native
    val ansiRegex: js.RegExp = js.native
    
    // background colors
    @JSImport("ng-packagr/lib/utils/color", "colors.bgBlack")
    @js.native
    val bgBlack: StyleFunction = js.native
    
    // bright background colors
    @JSImport("ng-packagr/lib/utils/color", "colors.bgBlackBright")
    @js.native
    val bgBlackBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgBlue")
    @js.native
    val bgBlue: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgBlueBright")
    @js.native
    val bgBlueBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgCyan")
    @js.native
    val bgCyan: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgCyanBright")
    @js.native
    val bgCyanBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgGreen")
    @js.native
    val bgGreen: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgGreenBright")
    @js.native
    val bgGreenBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgMagenta")
    @js.native
    val bgMagenta: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgMagentaBright")
    @js.native
    val bgMagentaBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgRed")
    @js.native
    val bgRed: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgRedBright")
    @js.native
    val bgRedBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgWhite")
    @js.native
    val bgWhite: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgWhiteBright")
    @js.native
    val bgWhiteBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgYellow")
    @js.native
    val bgYellow: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bgYellowBright")
    @js.native
    val bgYellowBright: StyleFunction = js.native
    
    // colors
    @JSImport("ng-packagr/lib/utils/color", "colors.black")
    @js.native
    val black: StyleFunction = js.native
    
    // bright colors
    @JSImport("ng-packagr/lib/utils/color", "colors.blackBright")
    @js.native
    val blackBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.blue")
    @js.native
    val blue: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.blueBright")
    @js.native
    val blueBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.bold")
    @js.native
    val bold: StyleFunction = js.native
    
    inline def create(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Any]
    
    @JSImport("ng-packagr/lib/utils/color", "colors.cyan")
    @js.native
    val cyan: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.cyanBright")
    @js.native
    val cyanBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.dim")
    @js.native
    val dim: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.enabled")
    @js.native
    def enabled: Boolean = js.native
    inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-packagr/lib/utils/color", "colors.gray")
    @js.native
    val gray: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.green")
    @js.native
    val green: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.greenBright")
    @js.native
    val greenBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.grey")
    @js.native
    val grey: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.hidden")
    @js.native
    val hidden: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.inverse")
    @js.native
    val inverse: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.italic")
    @js.native
    val italic: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.magenta")
    @js.native
    val magenta: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.magentaBright")
    @js.native
    val magentaBright: StyleFunction = js.native
    
    /**
      * Outputs a string with check-symbol as prefix
      */
    inline def ok(args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    @JSImport("ng-packagr/lib/utils/color", "colors.red")
    @js.native
    val red: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.redBright")
    @js.native
    val redBright: StyleFunction = js.native
    
    // modifiers
    @JSImport("ng-packagr/lib/utils/color", "colors.reset")
    @js.native
    val reset: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.strikethrough")
    @js.native
    val strikethrough: StyleFunction = js.native
    
    /**
      * Remove styles from string
      */
    inline def strip(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Remove styles from string
      */
    inline def stripColor(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripColor")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ng-packagr/lib/utils/color", "colors.styles")
    @js.native
    val styles: StylesType[StyleType] = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.symbols")
    @js.native
    val symbols: SymbolsType = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.underline")
    @js.native
    val underline: StyleFunction = js.native
    
    /**
      * Remove styles from string
      */
    inline def unstyle(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unstyle")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ng-packagr/lib/utils/color", "colors.visible")
    @js.native
    def visible: Boolean = js.native
    inline def visible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-packagr/lib/utils/color", "colors.white")
    @js.native
    val white: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.whiteBright")
    @js.native
    val whiteBright: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.yellow")
    @js.native
    val yellow: StyleFunction = js.native
    
    @JSImport("ng-packagr/lib/utils/color", "colors.yellowBright")
    @js.native
    val yellowBright: StyleFunction = js.native
  }
}
