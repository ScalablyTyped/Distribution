package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<prettier.prettier.BuiltInParserName, prettier.prettier.BuiltInParser> */
trait BuiltInParsers extends StObject {
  
  def angular(text: String): AST
  def angular(text: String, options: Any): AST
  @JSName("angular")
  var angular_Original: BuiltInParser
  
  def babel(text: String): AST
  def babel(text: String, options: Any): AST
  
  def `babel-flow`(text: String): AST
  def `babel-flow`(text: String, options: Any): AST
  @JSName("babel-flow")
  var `babel-flow_Original`: BuiltInParser
  
  def `babel-ts`(text: String): AST
  def `babel-ts`(text: String, options: Any): AST
  @JSName("babel-ts")
  var `babel-ts_Original`: BuiltInParser
  
  @JSName("babel")
  var babel_Original: BuiltInParser
  
  def css(text: String): AST
  def css(text: String, options: Any): AST
  @JSName("css")
  var css_Original: BuiltInParser
  
  def espree(text: String): AST
  def espree(text: String, options: Any): AST
  @JSName("espree")
  var espree_Original: BuiltInParser
  
  def flow(text: String): AST
  def flow(text: String, options: Any): AST
  @JSName("flow")
  var flow_Original: BuiltInParser
  
  def glimmer(text: String): AST
  def glimmer(text: String, options: Any): AST
  @JSName("glimmer")
  var glimmer_Original: BuiltInParser
  
  def graphql(text: String): AST
  def graphql(text: String, options: Any): AST
  @JSName("graphql")
  var graphql_Original: BuiltInParser
  
  def html(text: String): AST
  def html(text: String, options: Any): AST
  @JSName("html")
  var html_Original: BuiltInParser
  
  def json(text: String): AST
  def json(text: String, options: Any): AST
  
  def `json-stringify`(text: String): AST
  def `json-stringify`(text: String, options: Any): AST
  @JSName("json-stringify")
  var `json-stringify_Original`: BuiltInParser
  
  def json5(text: String): AST
  def json5(text: String, options: Any): AST
  @JSName("json5")
  var json5_Original: BuiltInParser
  
  @JSName("json")
  var json_Original: BuiltInParser
  
  def less(text: String): AST
  def less(text: String, options: Any): AST
  @JSName("less")
  var less_Original: BuiltInParser
  
  def lwc(text: String): AST
  def lwc(text: String, options: Any): AST
  @JSName("lwc")
  var lwc_Original: BuiltInParser
  
  def markdown(text: String): AST
  def markdown(text: String, options: Any): AST
  @JSName("markdown")
  var markdown_Original: BuiltInParser
  
  def mdx(text: String): AST
  def mdx(text: String, options: Any): AST
  @JSName("mdx")
  var mdx_Original: BuiltInParser
  
  def meriyah(text: String): AST
  def meriyah(text: String, options: Any): AST
  @JSName("meriyah")
  var meriyah_Original: BuiltInParser
  
  def scss(text: String): AST
  def scss(text: String, options: Any): AST
  @JSName("scss")
  var scss_Original: BuiltInParser
  
  def typescript(text: String): AST
  def typescript(text: String, options: Any): AST
  @JSName("typescript")
  var typescript_Original: BuiltInParser
  
  def vue(text: String): AST
  def vue(text: String, options: Any): AST
  @JSName("vue")
  var vue_Original: BuiltInParser
  
  def yaml(text: String): AST
  def yaml(text: String, options: Any): AST
  @JSName("yaml")
  var yaml_Original: BuiltInParser
}
object BuiltInParsers {
  
  inline def apply(
    angular: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    babel: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    `babel-flow`: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    `babel-ts`: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    css: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    espree: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    flow: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    glimmer: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    graphql: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    html: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    json: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    `json-stringify`: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    json5: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    less: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    lwc: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    markdown: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    mdx: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    meriyah: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    scss: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    typescript: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    vue: (/* text */ String, /* options */ js.UndefOr[Any]) => AST,
    yaml: (/* text */ String, /* options */ js.UndefOr[Any]) => AST
  ): BuiltInParsers = {
    val __obj = js.Dynamic.literal(angular = js.Any.fromFunction2(angular), babel = js.Any.fromFunction2(babel), css = js.Any.fromFunction2(css), espree = js.Any.fromFunction2(espree), flow = js.Any.fromFunction2(flow), glimmer = js.Any.fromFunction2(glimmer), graphql = js.Any.fromFunction2(graphql), html = js.Any.fromFunction2(html), json = js.Any.fromFunction2(json), json5 = js.Any.fromFunction2(json5), less = js.Any.fromFunction2(less), lwc = js.Any.fromFunction2(lwc), markdown = js.Any.fromFunction2(markdown), mdx = js.Any.fromFunction2(mdx), meriyah = js.Any.fromFunction2(meriyah), scss = js.Any.fromFunction2(scss), typescript = js.Any.fromFunction2(typescript), vue = js.Any.fromFunction2(vue), yaml = js.Any.fromFunction2(yaml))
    __obj.updateDynamic("babel-flow")(js.Any.fromFunction2(`babel-flow`))
    __obj.updateDynamic("babel-ts")(js.Any.fromFunction2(`babel-ts`))
    __obj.updateDynamic("json-stringify")(js.Any.fromFunction2(`json-stringify`))
    __obj.asInstanceOf[BuiltInParsers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuiltInParsers] (val x: Self) extends AnyVal {
    
    inline def setAngular(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "angular", js.Any.fromFunction2(value))
    
    inline def setBabel(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "babel", js.Any.fromFunction2(value))
    
    inline def `setBabel-flow`(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "babel-flow", js.Any.fromFunction2(value))
    
    inline def `setBabel-ts`(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "babel-ts", js.Any.fromFunction2(value))
    
    inline def setCss(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "css", js.Any.fromFunction2(value))
    
    inline def setEspree(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "espree", js.Any.fromFunction2(value))
    
    inline def setFlow(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "flow", js.Any.fromFunction2(value))
    
    inline def setGlimmer(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "glimmer", js.Any.fromFunction2(value))
    
    inline def setGraphql(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "graphql", js.Any.fromFunction2(value))
    
    inline def setHtml(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "html", js.Any.fromFunction2(value))
    
    inline def setJson(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "json", js.Any.fromFunction2(value))
    
    inline def `setJson-stringify`(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "json-stringify", js.Any.fromFunction2(value))
    
    inline def setJson5(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "json5", js.Any.fromFunction2(value))
    
    inline def setLess(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "less", js.Any.fromFunction2(value))
    
    inline def setLwc(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "lwc", js.Any.fromFunction2(value))
    
    inline def setMarkdown(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "markdown", js.Any.fromFunction2(value))
    
    inline def setMdx(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "mdx", js.Any.fromFunction2(value))
    
    inline def setMeriyah(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "meriyah", js.Any.fromFunction2(value))
    
    inline def setScss(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "scss", js.Any.fromFunction2(value))
    
    inline def setTypescript(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "typescript", js.Any.fromFunction2(value))
    
    inline def setVue(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "vue", js.Any.fromFunction2(value))
    
    inline def setYaml(value: (/* text */ String, /* options */ js.UndefOr[Any]) => AST): Self = StObject.set(x, "yaml", js.Any.fromFunction2(value))
  }
}
