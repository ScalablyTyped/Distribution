package typings.periscopic

import typings.estree.mod.ClassDeclaration
import typings.estree.mod.Identifier
import typings.estree.mod.Node
import typings.estree.mod.VariableDeclaration
import typings.periscopic.anon.Globals
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("periscopic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("periscopic", "Scope")
  @js.native
  open class Scope protected () extends StObject {
    def this(parent: Any, block: Any) = this()
    
    def add_declaration(node: ClassDeclaration): Unit = js.native
    /** @param {import('estree').VariableDeclaration | import('estree').ClassDeclaration} node */
    def add_declaration(node: VariableDeclaration): Unit = js.native
    
    /** @type {boolean} */
    var block: Boolean = js.native
    
    /** @type {Map<string, import('estree').Node>} */
    var declarations: Map[String, Node] = js.native
    
    /**
      * @param {string} name
      * @returns {Scope | null}
      */
    def find_owner(name: String): Scope | Null = js.native
    
    /**
      * @param {string} name
      * @returns {boolean}
      */
    def has(name: String): Boolean = js.native
    
    /** @type {Set<string>} */
    var initialised_declarations: Set[String] = js.native
    
    /** @type {Scope | null} */
    var parent: Scope | Null = js.native
    
    /** @type {Set<string>} */
    var references: Set[String] = js.native
  }
  
  inline def analyze(expression: Node): Globals = ^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(expression.asInstanceOf[js.Any]).asInstanceOf[Globals]
  
  inline def extractIdentifiers(param: Node): js.Array[Identifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract_identifiers")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[Identifier]]
  inline def extractIdentifiers(param: Node, nodes: js.Array[Identifier]): js.Array[Identifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract_identifiers")(param.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Identifier]]
  
  inline def extractNames(param: Node): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract_names")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
