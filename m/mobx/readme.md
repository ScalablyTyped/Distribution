
# Scala.js typings for mobx

Typings are for version 5.11.0

## Library description:
Simple, scalable state management.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | mobx |
| Keywords           | mobx, mobservable, observable, react-component, react, reactjs, reactive, model, frp, functional-reactive-programming, state management, data flow |
| # releases         | 80 |
| # dependents       | 812 |
| # downloads        | 10565100 |
| # stars            | 39 |

## Links
- [Homepage](https://mobx.js.org/)
- [Bugs](https://github.com/mobxjs/mobx/issues)
- [Repository](https://github.com/mobxjs/mobx)
- [Npm](https://www.npmjs.com/package/mobx)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * During a transaction no views are updated until the end of the transaction.
 * The transaction will be run synchronously nonetheless.
 *
 * @param action a function that updates some reactive state
 * @returns any value that was returned by the 'action' parameter.
 */
/**
 * (c) Michel Weststrate 2015 - 2018
 * MIT Licensed
 *
 * Welcome to the mobx sources! To get an global overview of how MobX internally works,
 * this is a good place to start:
 * https://medium.com/@mweststrate/becoming-fully-reactive-an-in-depth-explanation-of-mobservable-55995262a254#.xvbh6qd74
 *
 * Source folders:
 * ===============
 *
 * - api/     Most of the public static methods exposed by the module can be found here.
 * - core/    Implementation of the MobX algorithm; atoms, derivations, reactions, dependency trees, optimizations. Cool stuff can be found here.
 * - types/   All the magic that is need to have observable objects, arrays and values is in this folder. Including the modifiers like `asFlat`.
 * - utils/   Utility stuff.
 *
 */

```

