package typings.nodeRedUtil.mod

import typings.jsonata.mod.Expression
import typings.node.Buffer
import typings.nodeRedRegistry.mod.Node
import typings.nodeRedRegistry.mod.NodeMessage
import typings.nodeRedUtil.anon.Format
import typings.nodeRedUtil.anon.Key
import typings.nodeRedUtil.anon.MaxLength
import typings.nodeRedUtil.anon.Msg
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Util extends js.Object {
  
  /**
    * Safely clones a message object. This handles msg.req/msg.res objects that must
    * not be cloned.
    *
    * @param msg - the message object to clone
    * @returns the cloned message
    */
  def cloneMessage[T /* <: NodeMessage */](msg: T): T = js.native
  
  /**
    * Compares two objects, handling various JavaScript types.
    *
    * @param obj1
    * @param obj2
    * @returns whether the two objects are the same
    */
  def compareObjects(obj1: js.Object, obj2: js.Object): Boolean = js.native
  
  /**
    * Encode an object to JSON without losing information about non-JSON types
    * such as Buffer and Function.
    *
    * *This function is closely tied to its reverse within the editor*
    *
    * @param msg
    * @param opts
    * @returns the encoded object
    */
  def encodeObject(msg: Msg): Format = js.native
  def encodeObject(msg: Msg, opts: MaxLength): Format = js.native
  
  /**
    * Converts the provided argument to a Buffer, using type-dependent
    * methods.
    *
    * @param o - the property to convert to a Buffer
    * @returns the Buffer version
    */
  def ensureBuffer(o: js.Any): Buffer = js.native
  
  /**
    * Converts the provided argument to a String, using type-dependent
    * methods.
    *
    * @param o - the property to convert to a String
    * @returns the stringified version
    */
  def ensureString(o: js.Any): String = js.native
  
  /**
    * Checks if a String contains any Environment Variable specifiers and returns
    * it with their values substituted in place.
    *
    * For example, if the env var `WHO` is set to `Joe`, the string `Hello ${WHO}!`
    * will return `Hello Joe!`.
    * @param value - the string to parse
    * @param node - the node evaluating the property
    * @returns The parsed string
    */
  def evaluateEnvProperty(value: String, node: Node[js.Object]): String = js.native
  
  /**
    * Evaluates a JSONata expression.
    * The expression must have been prepared with `prepareJSONataExpression`
    * before passing to this function.
    *
    * @param   expr     - the prepared JSONata expression
    * @param   msg      - the message object to evaluate against
    * @param   callback - (optional) called when the expression is evaluated
    * @returns If no callback was provided, the result of the expression
    */
  def evaluateJSONataExpression(expr: Expression, msg: js.Object): js.Any = js.native
  def evaluateJSONataExpression(
    expr: Expression,
    msg: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* resp */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * Evaluates a property value according to its type.
    *
    * @param   value    - the raw value
    * @param   type     - the type of the value
    * @param   node     - the node evaluating the property
    * @param   msg      - the message object to evaluate against
    * @param   callback - (optional) called when the property is evaluated
    * @returns The evaluted property, if no `callback` is provided
    */
  def evaluateNodeProperty(value: String, `type`: String, node: Node[js.Object], msg: js.Object): js.Any = js.native
  def evaluateNodeProperty(
    value: String,
    `type`: String,
    node: Node[js.Object],
    msg: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * Generates a psuedo-unique-random id.
    * @returns a random-ish id
    */
  def generateId(): String = js.native
  
  /**
    * Gets a property of a message object.
    *
    * Unlike `getObjectProperty`, this function will strip `msg.` from the
    * front of the property expression if present.
    *
    * @param msg - the message object
    * @param expr - the property expression
    * @returns the message property, or undefined if it does not exist
    */
  def getMessageProperty(msg: js.Object, expr: String): js.Any = js.native
  
  /**
    * Gets a property of an object.
    *
    * @param msg - the object
    * @param expr - the property expression
    * @returns the object property, or undefined if it does not exist
    */
  def getObjectProperty(msg: js.Object, expr: String): js.Any = js.native
  
  /**
    * Get value of environment variable.
    * @param node - accessing node
    * @param name - name of variable
    * @returns value of env var
    */
  def getSetting(node: Node[js.Object], name: String): String = js.native
  
  /**
    * Normalise a node type name to camel case.
    *
    * For example: `a-random node type` will normalise to `aRandomNodeType`
    *
    * @param name - the node type
    * @returns The normalised name
    */
  def normaliseNodeTypeName(name: String): String = js.native
  
  /**
    * Parses a property expression, such as `msg.foo.bar[3]` to validate it
    * and convert it to a canonical version expressed as an Array of property
    * names.
    *
    * For example, `a["b"].c` returns `['a','b','c']`
    *
    * @param str - the property expression
    * @returns the normalised expression
    */
  def normalisePropertyExpression(str: String): js.Array[String | Double] = js.native
  
  /**
    * Parses a context property string, as generated by the TypedInput, to extract
    * the store name if present.
    *
    * For example, `#:(file)::foo` results in ` { store: "file", key: "foo" }`.
    *
    * @param key - the context property string to parse
    * @returns The parsed property
    */
  def parseContextStore(key: String): Key = js.native
  
  /**
    * Prepares a JSONata expression for evaluation.
    * This attaches Node-RED specific functions to the expression.
    *
    * @param value - the JSONata expression
    * @param node  - the node evaluating the property
    * @returns The JSONata expression that can be evaluated
    */
  def prepareJSONataExpression(value: String, node: Node[js.Object]): Expression = js.native
  
  /**
    * Sets a property of a message object.
    *
    * Unlike `setObjectProperty`, this function will strip `msg.` from the
    * front of the property expression if present.
    *
    * @param  msg           - the message object
    * @param  prop          - the property expression
    * @param  value         - the value to set
    * @param  createMissing - whether to create missing parent properties
    */
  def setMessageProperty(msg: js.Object, prop: String, value: js.Any): Boolean = js.native
  def setMessageProperty(msg: js.Object, prop: String, value: js.Any, createMissing: Boolean): Boolean = js.native
  
  /**
    * Sets a property of an object.
    *
    * @param  msg           - the object
    * @param  prop          - the property expression
    * @param  value         - the value to set
    * @param  createMissing - whether to create missing parent properties
    */
  def setObjectProperty(msg: js.Object, prop: String, value: js.Any): Boolean = js.native
  def setObjectProperty(msg: js.Object, prop: String, value: js.Any, createMissing: Boolean): Boolean = js.native
}
